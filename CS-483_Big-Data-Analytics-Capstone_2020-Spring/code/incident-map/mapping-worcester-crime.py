import numpy as np # linear algebra
import pandas as pd # data processing, CSV file I/O (e.g. pd.read_csv)

# Looking at null values
import folium
import matplotlib.pyplot as plt
import seaborn as sns

crimes = pd.read_csv('/Users/tcrokicki/Documents/WorcesterData.csv',error_bad_lines=False)

crimes.ACTUAL_DTE = pd.to_datetime(crimes.ACTUAL_DTE, format='%Y-%m-%d %H:%M:%S')

crimes['PRIMARY_STREET_NAME']        	= pd.Categorical(crimes['PRIMARY_STREET_NAME'])
crimes['PRIMARY_CITY'] 					= pd.Categorical(crimes['PRIMARY_CITY'])
crimes['PRIMARY_STATE_CD']          	= pd.Categorical(crimes['PRIMARY_STATE_CD'])
crimes['IBR_TYPE']          			= pd.Categorical(crimes['IBR_TYPE'])
crimes['IBR_TYPE_DESC']          		= pd.Categorical(crimes['IBR_TYPE_DESC'])

crimes = crimes.set_index(['ACTUAL_DTE'])

crimes = crimes.dropna()
df = crimes.drop(columns=['P_INCID_NO', 'IBR_TYPE'], axis = 1)

worcester_map = folium.Map(location=[42.2626,71.8023], zoom_start=11, tiles="CartoDB dark_matter")

df['primary_address'] = (df['PRIMARY_STREET_NUM'].astype(str) + " " + df['PRIMARY_STREET_NAME'].astype(str))

primary_addresses = df['primary_address']

df['new_locations'] = list(zip(df.LATITUDE, df.LONGITUDE))
new_locations = df['new_locations']

for i in range(len(new_locations)):
    lat = new_locations.iloc[i][0]
    long = new_locations.iloc[i][1]
    popup_text = """Community Index : {}<br>Arrest : {}<br>Location Description : {}<br>"""
    popup_text = popup_text.format(new_locations.index[i], new_locations.iloc[i][-1], new_locations.iloc[i][-2])
    folium.CircleMarker(location = [lat, long], popup= popup_text, fill = True).add_to(worcester_map)