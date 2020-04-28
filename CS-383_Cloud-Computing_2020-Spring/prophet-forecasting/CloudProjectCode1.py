# import libraries
import boto3, re, sys, math, json, os, sagemaker, urllib.request
from sagemaker import get_execution_role
import numpy as np                                
import pandas as pd                               
import matplotlib.pyplot as plt                   
from IPython.display import Image                 
from IPython.display import display               
from time import gmtime, strftime                 
from sagemaker.predictor import csv_serializer
import random
import seaborn as sns
!conda install -c plotly plotly==3.10.0 --yes
!conda install -c conda-forge fbprophet --yes
from fbprophet import Prophet
Prophet()

# Define IAM role
role = get_execution_role()
prefix = 'sagemaker/DEMO-xgboost-dm'
containers = {'us-west-2': '433757028032.dkr.ecr.us-west-2.amazonaws.com/xgboost:latest',
              'us-east-1': '811284229777.dkr.ecr.us-east-1.amazonaws.com/xgboost:latest',
              'us-east-2': '825641698319.dkr.ecr.us-east-2.amazonaws.com/xgboost:latest',
              'eu-west-1': '685385470294.dkr.ecr.eu-west-1.amazonaws.com/xgboost:latest'} # each region has its XGBoost container
my_region = boto3.session.Session().region_name # set the region of the instance
print("Success - the MySageMakerInstance is in the " + my_region + " region. You will use the " + containers[my_region] + " container for your SageMaker endpoint.")

#Import the dataset
try:
  data = pd.read_csv('WorcesterData_03_19.csv',index_col=0)
  print('Success: Data loaded into dataframe.')
except Exception as e:
    print('Data load error: ',e)

data.head()

# Let's see how many null elements are contained in the data
plt.figure(figsize=(10,10))
sns.heatmap(data.isnull(), cbar = False, cmap = 'YlGnBu')
data.ACTUAL_DTE = pd.to_datetime(data.ACTUAL_DTE, format='%m/%d/%Y %H:%M')

# setting the index to be the date 
data.index = pd.DatetimeIndex(data.ACTUAL_DTE)

# Resample is a Convenience method for frequency conversion and resampling of time series.

plt.plot(data.resample('Y').size())
plt.title('Crimes Count Per Year')
plt.xlabel('Years')
plt.ylabel('Number of Crimes')

#Resampling the data
data.resample('M').size()

# Resample is a Convenience method for frequency conversion and resampling of time series.

plt.plot(data.resample('M').size())
plt.title('Crimes Count Per Month')
plt.xlabel('Months')
plt.ylabel('Number of Crimes')
data.resample('Q').size()

# Resample is a Convenience method for frequency conversion and resampling of time series.

plt.plot(data.resample('Q').size())
plt.title('Crimes Count Per Quarter')
plt.xlabel('Quarters')
plt.ylabel('Number of Crimes')

#Preparing the data for the prediction by using prophet
data_prophet = data.resample('M').size().reset_index()

data_prophet
data_prophet.columns = ['Date', 'Crime Count']
data_prophet
data_prophet_df = pd.DataFrame(data_prophet)
data_prophet_df

#renaming the columns in order to adapt it to the prediction
data_prophet_df2 = data_prophet_df.rename(columns={'Date':'ds', 'Crime Count':'y'})

data_prophet_df2

m = Prophet()
m.fit(data_prophet_df2)

# Forcasting into the future
future = m.make_future_dataframe(periods=365)
forecast = m.predict(future)

forecast

#Visualize
figure = m.plot(forecast, xlabel='Date', ylabel='Crime Rate')

#Visualizing the trend for the future years 
figure3 = m.plot_components(forecast)