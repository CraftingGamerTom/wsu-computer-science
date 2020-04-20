# We will run this with python3. Open a python console with the command:
# > python3

# This requires pandas, numpy, & matplotlib. Run the command below to install:
# > pip3 install pandas
# > pip3 install numpy
# > pip3 install matplotlib

import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
plt.style.use('seaborn')

# Path to the data on your computer
dataPath = '/media/tcrokicki/MainDrive/temp-school/capstone/'

crimes19 = pd.read_csv(dataPath + 'WorcesterData - 2019.csv',error_bad_lines=False)
crimes18 = pd.read_csv(dataPath + 'WorcesterData - 2018.csv',error_bad_lines=False)
crimes17 = pd.read_csv(dataPath + 'WorcesterData - 2017.csv',error_bad_lines=False)
crimes16 = pd.read_csv(dataPath + 'WorcesterData - 2016.csv',error_bad_lines=False)
crimes15 = pd.read_csv(dataPath + 'WorcesterData - 2015.csv',error_bad_lines=False)
crimes14 = pd.read_csv(dataPath + 'WorcesterData - 2014.csv',error_bad_lines=False)
crimes13 = pd.read_csv(dataPath + 'WorcesterData - 2013.csv',error_bad_lines=False)
crimes12 = pd.read_csv(dataPath + 'WorcesterData - 2012.csv',error_bad_lines=False)
crimes11 = pd.read_csv(dataPath + 'WorcesterData - 2011.csv',error_bad_lines=False)
crimes10 = pd.read_csv(dataPath + 'WorcesterData - 2010.csv',error_bad_lines=False)
crimes09 = pd.read_csv(dataPath + 'WorcesterData - 2009.csv',error_bad_lines=False)
crimes08 = pd.read_csv(dataPath + 'WorcesterData - 2008.csv',error_bad_lines=False)
crimes07 = pd.read_csv(dataPath + 'WorcesterData - 2007.csv',error_bad_lines=False)
crimes06 = pd.read_csv(dataPath + 'WorcesterData - 2006.csv',error_bad_lines=False)
crimes05 = pd.read_csv(dataPath + 'WorcesterData - 2005.csv',error_bad_lines=False)
crimes04 = pd.read_csv(dataPath + 'WorcesterData - 2004.csv',error_bad_lines=False)
crimes03 = pd.read_csv(dataPath + 'WorcesterData - 2003.csv',error_bad_lines=False)
unmergedData = [crimes03, crimes04, crimes05, crimes06, crimes07, crimes08, crimes09, crimes10, crimes11, crimes12, crimes13, crimes14, crimes15, crimes16, crimes17, crimes18, crimes19]

# concat the data
crimes = pd.concat(unmergedData, ignore_index=False, axis=0)

# Use to create new csv with the merged data
crimes.to_csv(dataPath + 'WorcesterData_03-19.csv')

# clean up references to unmerged data
for i in unmergedData:
   del i

# notify the data is merged
print('Dataset concatenated..')