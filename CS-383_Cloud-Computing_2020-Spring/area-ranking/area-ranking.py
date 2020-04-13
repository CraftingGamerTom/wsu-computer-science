# 1) Load the data (common/merge-data.py) OR run common/read-all-crime-data.py

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
plt.style.use('seaborn')

# --------------------------------------------------
# ----- Create a copy of the crimes dataset
# --------------------------------------------------
ranked_crimes = crimes.copy()


# --------------------------------------------------
# ----- Group the incidents into bins
# --------------------------------------------------
chunk_size = 0.005
to_bin = lambda x: np.floor(x / chunk_size) * chunk_size
ranked_crimes["latbin"] = ranked_crimes.LATITUDE.map(to_bin)
ranked_crimes["lonbin"] = ranked_crimes.LONGITUDE.map(to_bin)
# groups = ranked_crimes.groupby(("latbin", "lonbin"))



# --------------------------------------------------
# ----- Determine the different types of incidents
# --------------------------------------------------
incident_values = ranked_crimes[["IBR_TYPE", "IBR_TYPE_DESC"]].values.ravel()
unique_incident_values =  pd.unique(incident_values)
print(unique_incident_values)

# --------------------------------------------------
# ----- Assign a danger value to each incident type
# --------------------------------------------------

['23G' 'Theft of Motor Vehicle Parts' 'ZZZ' 'Non-NIBRS Offense' '23H'
 'All Other Thefts' '40A' 'Prostitution' '35A' 'Drug/Narcotic Violations'
 '240' 'Motor Vehicle Theft' '23F' 'Theft from Motor Vehicle' '120'
 'Robbery' '290' 'Destruction/Damage/Vandalism of Property' '23D'
 'Theft from Building' '13C' 'Assault - Intimidation' '13A'
 'Aggravated Assault' '220' 'Burglary/Breaking & Entering' '11D'
 'Forcible Fondling' '26C' 'Impersonation' '13B' 'Simple Assault' '23C'
 'Shoplifting' '520' 'Weapon Law Violation' '90C' 'Disorderly Conduct'
 '90Z' 'All Other Offenses' '26E' 'Wire Fraud' '90J'
 'Trespass of Real Property' '90D' 'Driving Under the Influence' '90I'
 'Runaway' '250' 'Counterfeiting/Forgery' '26B'
 'Credit Card/Automatic Teller Fraud' '90G' 'Liquor Law Violation' '35B'
 'Drug Equipment Violations' '90F' 'Family Offenses, Nonviolent' '90N'
 'Resisting Arrest' '200' 'Arson' '11A' 'Forcible Rape' '36B'
 'Statutory Rape (Nonforcible Sex Offense)' '11B' 'Forcible Sodomy' '26A'
 'False Pretense/Swindle/Confidence Game' '09A'
 'Murder & Nonnegligent Manslaughter' '23E'
 'Theft from Coin-operated Machine' '280' 'Stolen Property Offenses' '100'
 'Kidnapping/Abduction' '270' 'Embezzlement' '90M'
 'Other Agencies (Mental Health)' '23B' 'Purse Snatching' '370'
 'Pornography/Obscene Material' '11C' 'Sexual Assault with an Object'
 '36A' 'Incest (Nonforcible Sex Offense)' '90P'
 'Contributing to the Delinquency of a Minor' '23A' 'Pocket Picking' '90E'
 'Drunkenness' '210' 'Extortion/Blackmail' '90A' 'Bad Checks' '39C'
 'Gambling Equipment Violations' '90L' 'Truancy' '90K' 'Incorrigible'
 'VOI' 'VOI (Added during conversion)' '40B'
 'Assisting or Promoting Prostitution' '26F' 'Identity Theft' '720'
 'Animal Cruelty' '26G' 'Hacking/Computer Invasion' '39B'
 'Operating/Promoting/Assisting Gambling' '64A'
 'Human Trafficking, Commercial Sex Acts' 'Zx' '64B'
 'Human Trafficking, Involuntary Servitude' '90B'
 'Curfew/Loitering/Vagrancy' '26D' 'Welfare Fraud']

# Turn it into a new dataframe to join with
# Assign weight values to different ranked_crimes to represent the danger level. These weight values are arbitrary, relative to statistics, I chose them myself.
# Key                       Value
# Violent Incident          9
# Property Incident         7
# Non-Violent Incident      5
# White-Collar Incident     3
# Low-Risk Incident         2
# Other / Unkown Incident   1


# import the StrinIO function 
# from io module 
from io import StringIO 

# let's read the data using the Pandas read_csv() function 

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

weighted_incidents['INCIDENT_CODE']          			= pd.Categorical(weighted_incidents['INCIDENT_CODE'])
weighted_incidents['INCIDENT_DESC']          		= pd.Categorical(weighted_incidents['INCIDENT_DESC'])

# --------------------------------------------------
# ----- Join incidents on the weighted incidents data
# --------------------------------------------------
# reference https://www.shanelynn.ie/merge-join-dataframes-python-pandas-index-1/
ranked_crimes = pd.merge(ranked_crimes, weighted_incidents[["INCIDENT_CODE","INCIDENT_WEIGHT"]], left_on="IBR_TYPE", right_on="INCIDENT_CODE", how="left")

# --------------------------------------------------
# ----- Determine the bin rank by year
# --------------------------------------------------
rankedBins_year = ranked_crimes.groupby(['Year','latbin','lonbin'], as_index=False).agg({"INCIDENT_WEIGHT": "sum"})
rankedBins_year = rankedBins_year.rename(columns={"INCIDENT_WEIGHT": "WEIGHTED_INCIDENT_SCORE"})

# > pip3 install sklearn
from sklearn.preprocessing import MinMaxScaler
scaler = MinMaxScaler() 
rankedBins_year['RANK'] = scaler.fit_transform(rankedBins_year[['WEIGHTED_INCIDENT_SCORE']])

# --------------------------------------------------
# ----- Determine the bin rank by day
# --------------------------------------------------

rankedBins_day = ranked_crimes.groupby([ranked_crimes.ACTUAL_DTE.dt.year,ranked_crimes.ACTUAL_DTE.dt.month,ranked_crimes.ACTUAL_DTE.dt.day,'latbin','lonbin'], as_index=True).agg({"INCIDENT_WEIGHT": "sum"})
rankedBins_day = rankedBins_day.rename(columns={"INCIDENT_WEIGHT": "WEIGHTED_INCIDENT_SCORE"})

# > pip3 install sklearn
from sklearn.preprocessing import MinMaxScaler
scaler = MinMaxScaler() 
rankedBins_day['RANK'] = scaler.fit_transform(rankedBins_day[['WEIGHTED_INCIDENT_SCORE']])

# --------------------------------------------------
# ----- Determine the bin rank by month
# --------------------------------------------------

rankedBins_month = ranked_crimes.groupby([ranked_crimes.ACTUAL_DTE.dt.year,ranked_crimes.ACTUAL_DTE.dt.month,'latbin','lonbin'], as_index=True).agg({"INCIDENT_WEIGHT": "sum"})
rankedBins_month = rankedBins_month.rename(columns={"INCIDENT_WEIGHT": "WEIGHTED_INCIDENT_SCORE"})

# > pip3 install sklearn
from sklearn.preprocessing import MinMaxScaler
scaler = MinMaxScaler() 
rankedBins_month['RANK'] = scaler.fit_transform(rankedBins_month[['WEIGHTED_INCIDENT_SCORE']])


# --------------------------------------------------
# ----- Save the data
# --------------------------------------------------

dataPath = '/media/tcrokicki/MainDrive/temp-school/capstone/'
rankedBins_year.to_csv(dataPath + 'WorcesterData_BinRanked_Year.csv')
rankedBins_month.to_csv(dataPath + 'WorcesterData_BinRanked_Month.csv')
rankedBins_day.to_csv(dataPath + 'WorcesterData_BinRanked_Day.csv')