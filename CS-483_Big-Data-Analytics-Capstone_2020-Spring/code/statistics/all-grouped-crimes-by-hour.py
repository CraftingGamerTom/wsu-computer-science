# Map Code:
# https://www.kaggle.com/txp142130/utd-crimes-in-chicago-with-choropleth-map
# 
# Code and Logic: 
# CraftingGamerTom (Thomas Rokicki)

df_crime = crimes



# --------------------------------------------------
# ----- Read in Crime Types with weighted values
# --------------------------------------------------

# let's read the data using the Pandas read_csv() function 
from io import StringIO 

weightedIncidentsString = StringIO("""
INCIDENT_CODE;INCIDENT_DESC;INCIDENT_WEIGHT;
23G;Theft of Motor Vehicle Parts;7;
ZZZ;Non-NIBRS Offense;1;
23H;All Other Thefts;7;
40A;Prostitution;5;
35A;Drug/Narcotic Violations;5;
240;Motor Vehicle Theft;7;
23F;Theft from Motor Vehicle;7;
120;Robbery;7;
290;Destruction/Damage/Vandalism of Property;7;
23D;Theft from Building;7;
13C;Assault - Intimidation;9;
13A;Aggravated Assault;9;
220;Burglary/Breaking & Entering;7;
11D;Forcible Fondling;9;
26C;Impersonation;3;
13B;Simple Assault;9;
23C;Shoplifting;7;
520;Weapon Law Violation;5;
90C;Disorderly Conduct;5;
90Z;All Other Offenses;1;
26E;Wire Fraud;3;
90J;Trespass of Real Property;7;
90D;Driving Under the Influence;5;
90I;Runaway;2;
250;Counterfeiting/Forgery;3;
26B;Credit Card/Automatic Teller Fraud;3;
90G;Liquor Law Violation;3;
35B;Drug Equipment Violations;5;
90F;Family Offenses, Nonviolent;5;
90N;Resisting Arrest;9;
200;Arson;7;
11A;Forcible Rape;9;
36B;Statutory Rape (Nonforcible Sex Offense);2;
11B;Forcible Sodomy;9;
26A;False Pretense/Swindle/Confidence Game;3;
09A;Murder & Nonnegligent Manslaughter;9;
23E;Theft from Coin-operated Machine;7;
280;Stolen Property Offenses;7;
100;Kidnapping/Abduction;9;
270;Embezzlement;3;
90M;Other Agencies (Mental Health);1;
23B;Purse Snatching;9;
370;Pornography/Obscene Material;2;
11C;Sexual Assault with an Object;9;
36A;Incest (Nonforcible Sex Offense);2;
90P;Contributing to the Delinquency of a Minor;2;
23A;Pocket Picking;7;
90E;Drunkenness;5;
210;Extortion/Blackmail;3;
90A;Bad Checks;3;
39C;Gambling Equipment Violations;3;
90L;Truancy;2;
90K;Incorrigible;3;
VOI;VOI (Added during conversion);9;
40B;Assisting or Promoting Prostitution;5;
26F;Identity Theft;3;
720;Animal Cruelty;5;
26G;Hacking/Computer Invasion;3;
39B;Operating/Promoting/Assisting Gambling;3;
64A;Human Trafficking, Commercial Sex Acts;5;
64B;Human Trafficking, Involuntary Servitude;5;
90B;Curfew/Loitering/Vagrancy;2;
26D;Welfare Fraud;3;
Zx;Unknown;1;
""")

weighted_incidents = pd.read_csv(weightedIncidentsString, sep =";") 
weighted_incidents['INCIDENT_CODE']          		= pd.Categorical(weighted_incidents['INCIDENT_CODE'])
weighted_incidents['INCIDENT_DESC']          		= pd.Categorical(weighted_incidents['INCIDENT_DESC'])


# --------------------------------------------------
# ----- Read in Crime Group Types
# --------------------------------------------------
incidentTypeGroupsString = StringIO("""
INCIDENT_TYPE_GROUP;INCIDENT_TYPE_WEIGHT;
Violent Incident;9;
Property Incident;7;
Non-Violent Incident;5;
White-Collar Incident;3;
Low-Risk Incident;2;
Other / Unkown Incident;1;
""")

incident_type_groups = pd.read_csv(incidentTypeGroupsString, sep =";") 
incident_type_groups['INCIDENT_TYPE_GROUP'] = pd.Categorical(incident_type_groups['INCIDENT_TYPE_GROUP'])


# --------------------------------------------------
# ----- Join group types with the Type weight
# --------------------------------------------------
grouped_crimes = pd.merge(incident_type_groups, weighted_incidents[["INCIDENT_CODE","INCIDENT_WEIGHT"]], left_on="INCIDENT_TYPE_WEIGHT", right_on="INCIDENT_WEIGHT", how="left")

# --------------------------------------------------
# ----- Join incidents on the group types
# --------------------------------------------------
grouped_crimes = pd.merge(crimes, grouped_crimes[["INCIDENT_CODE","INCIDENT_TYPE_GROUP"]], left_on="IBR_TYPE", right_on="INCIDENT_CODE", how="left")

# --------------------------------------------------
# ----- Display Grouped Crimes by Hour
# --------------------------------------------------
grouped_crimes.groupby([grouped_crimes['ACTUAL_DTE'].dt.hour,'INCIDENT_TYPE_GROUP',])['P_INCID_NO'].count().unstack().plot(marker='o')
plt.ylabel('Number of Crimes')
plt.xlabel('Hours of the day')
plt.xticks(np.arange(24))
plt.show()