# This Python 3 environment comes with many helpful analytics libraries installed
# It is defined by the kaggle/python docker image: https://github.com/kaggle/docker-python
# For example, here's several helpful packages to load in 

import numpy as np # linear algebra
import pandas as pd # data processing, CSV file I/O (e.g. pd.read_csv)

import folium
import matplotlib.pyplot as plt
import seaborn as sns
plt.style.use('seaborn')
%matplotlib inline


# Read the file
crimeDataCsvPath = '/media/tcrokicki/MainDrive/temp-school/capstone/WorcesterData_03-19.csv'
crimes = pd.read_csv(crimeDataCsvPath,error_bad_lines=False)


# Clean up duplicate information if it exists
print('Dataset Shape before drop_duplicate : ', crimes.shape)
crimes.drop_duplicates(subset=['P_INCID_NO'], inplace=True)
print('Dataset Shape after drop_duplicate: ', crimes.shape)

# Use line below to drop columns not needed, optional
# crimes.drop(['Year', 'P_INCID_NO'], inplace=True, axis=1)

# display first three rows to confirm we have what we expect
crimes.head(3)
#crimes.shape
#crimes.info()

# Below uses seconds (we dont have seconds) & capital Y instead of lowercase for last two digits of year
#crimes.ACTUAL_DTE = pd.to_datetime(crimes.ACTUAL_DTE, format='%m/%d/%Y %I:%M:%S %p')
#crimes.ACTUAL_DTE = pd.to_datetime(crimes.ACTUAL_DTE, format='%m/%d/%y %I:%M %p')
crimes.ACTUAL_DTE = pd.to_datetime(crimes.ACTUAL_DTE, format='%m/%d/%Y %H:%M:%S', infer_datetime_format=True)

# Set the index to the date time (FOR MAPS ONLY)
crimes = crimes.set_index(['ACTUAL_DTE'])

# Set the categorical data for pandas
crimes['PRIMARY_STREET_NAME']        	= pd.Categorical(crimes['PRIMARY_STREET_NAME'])
crimes['PRIMARY_CITY'] 					= pd.Categorical(crimes['PRIMARY_CITY'])
crimes['PRIMARY_STATE_CD']          	= pd.Categorical(crimes['PRIMARY_STATE_CD'])
crimes['PRIMARY_ZIP_CD']                = pd.Categorical(crimes['PRIMARY_ZIP_CD'])
crimes['PRIMARY_ADDR_NO']        	    = pd.Categorical(crimes['PRIMARY_ADDR_NO'])
crimes['IBR_TYPE']          			= pd.Categorical(crimes['IBR_TYPE'])
crimes['IBR_TYPE_DESC']          		= pd.Categorical(crimes['IBR_TYPE_DESC'])

# Set the integer values (float by default)
crimes                                  = crimes.astype({'PRIMARY_STREET_NUM': 'Int32'})


# Done
print('You are ready to use the data')