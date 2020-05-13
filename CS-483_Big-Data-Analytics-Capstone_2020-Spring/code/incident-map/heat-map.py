import numpy as np

import pandas as pd

from subprocess import check_output

crimes = pd.read_csv('WorcesterData_03_19.csv',error_bad_lines=False)

crimes['IBR_TYPE_DESC'].unique()
Out[5]: 
array(['Theft of Motor Vehicle Parts', 'Non-NIBRS Offense',
       'All Other Thefts', 'Prostitution', 'Drug/Narcotic Violations',
       'Motor Vehicle Theft', 'Theft from Motor Vehicle', 'Robbery',
       'Destruction/Damage/Vandalism of Property', 'Theft from Building',
       'Assault - Intimidation', 'Aggravated Assault',
       'Burglary/Breaking & Entering', 'Forcible Fondling',
       'Disorderly Conduct', 'Impersonation', 'Simple Assault',
       'Shoplifting', 'Weapon Law Violation', 'All Other Offenses',
       'Wire Fraud', 'Trespass of Real Property',
       'Driving Under the Influence', 'Runaway', 'Counterfeiting/Forgery',
       'Arson', 'Credit Card/Automatic Teller Fraud',
       'Liquor Law Violation', 'Drug Equipment Violations',
       'Family Offenses, Nonviolent', 'Resisting Arrest', 'Forcible Rape',
       'Statutory Rape (Nonforcible Sex Offense)', 'Forcible Sodomy',
       'False Pretense/Swindle/Confidence Game',
       'Stolen Property Offenses', 'Murder & Nonnegligent Manslaughter',
       'Theft from Coin-operated Machine', 'Kidnapping/Abduction',
       'Embezzlement', 'Other Agencies (Mental Health)',
       'Purse Snatching', 'Pornography/Obscene Material',
       'Sexual Assault with an Object',
       'Incest (Nonforcible Sex Offense)',
       'Contributing to the Delinquency of a Minor', 'Pocket Picking',
       'Drunkenness', 'Extortion/Blackmail', 'Bad Checks',
       'VOI (Added during conversion)', 'Gambling Equipment Violations',
       'Operating/Promoting/Assisting Gambling', 'Betting/Wagering',
       'Assisting or Promoting Prostitution', 'Incorrigible',
       'Identity Theft', 'Animal Cruelty', 'Hacking/Computer Invasion',
       'Human Trafficking, Commercial Sex Acts', 'Zx',
       'Human Trafficking, Involuntary Servitude',
       'Curfew/Loitering/Vagrancy', 'Welfare Fraud'], dtype=object)

crimes.columns.get_loc('LATITUDE')
Out[6]: 10

minLat = crimes['LATITUDE'].mean() - crimes['LATITUDE'].std()
maxLat = crimes['LATITUDE'].mean() + crimes['LATITUDE'].std()
minLon = crimes['LONGITUDE'].mean() - crimes['LONGITUDE'].std()
maxLon = crimes['LONGITUDE'].mean() + crimes['LONGITUDE'].std()
ndf = crimes[crimes['LATITUDE'] <= maxLat]
ndf = ndf[ndf['LATITUDE'] >= minLat]
ndf  = ndf[ndf['LONGITUDE']<=maxLon]
ndf  = ndf[ndf['LONGITUDE']>minLon]

import matplotlib.pyplot as plt
import seaborn as sns
n3df = ndf[ndf['Year']>=2003]
nd3df = ndf[ndf['Year']<=2019]
nnhdf = n3df[(n3df['IBR_TYPE_DESC']!= 'Destruction/Damage/Vandalism of Property') & 
            (n3df['IBR_TYPE_DESC']!=  'Simple Assault') &
            (n3df['IBR_TYPE_DESC']!= 'Burglary/Breaking & Entering')]
nhdf = n3df[n3df['IBR_TYPE_DESC']=='Destruction/Damage/Vandalism of Property']
ntdf = n3df[(n3df['IBR_TYPE_DESC']=='Simple Assault')| 
           (n3df['IBR_TYPE_DESC']=='Burglary/Breaking & Entering')]

f,ax= plt.subplots(1,1,figsize=(12,10))
plt.ylim(42.1,42.4)
plt.xlim(-72.0,-71.6)
other = ax.scatter(nnhdf['LONGITUDE'],nnhdf['LATITUDE'], s=0.4, alpha=1, label = 'other crimes')
homicides = ax.scatter(nhdf['LONGITUDE'],nhdf['LATITUDE'], s=5, alpha=1,color='red', label='homicides')
tr = ax.scatter(ntdf['LONGITUDE'],ntdf['LATITUDE'], s=0.3, alpha=0.4,color='yellow',label='thefts and robberies')
plt.title('Crimes Map - From 2003 to 2019')
lgnd = plt.legend(handles=[homicides, tr,other])
