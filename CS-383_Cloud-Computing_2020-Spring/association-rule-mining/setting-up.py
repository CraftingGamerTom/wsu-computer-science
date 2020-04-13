# Apriori Algorithm for Association Rule Mining

# ----------------------------------------------------------------
# ------------------ SETTING UP THE RANKED DATA ------------------
# ----------------------------------------------------------------

# Install assocation rule mining library
# pip3 install apyori

import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from apyori import apriori

dataCsvPath = '/media/tcrokicki/MainDrive/temp-school/capstone/'
dailyRankedCrimes = pd.read_csv(dataCsvPath + "WorcesterData_BinRanked_Day.csv",error_bad_lines=False)
yearlyRankedCrimes = pd.read_csv(dataCsvPath + "WorcesterData_BinRanked_Year.csv",error_bad_lines=False)

# Fix the Column names in the daily ranked crimes
# Found that this breaks assocation rule mining - related to using date? 
#dailyRankedCrimes['ACTUAL_DTE'] = pd.to_datetime(dailyRankedCrimes['ACTUAL_DTE']*10000+dailyRankedCrimes['ACTUAL_DTE.1']*100+dailyRankedCrimes['ACTUAL_DTE.2'],format='%Y%m%d')
#del dailyRankedCrimes['ACTUAL_DTE.1']
#del dailyRankedCrimes['ACTUAL_DTE.2']
# Still an issue if converted to a nominal (category):
#dailyRankedCrimes['ACTUAL_DTE'] = dailyRankedCrimes['ACTUAL_DTE'].dt.strftime('%Y-%m-%d')
#dailyRankedCrimes['ACTUAL_DTE']          		= pd.Categorical(dailyRankedCrimes['ACTUAL_DTE'])

# Done Loading Data
print('You are ready to use the data')