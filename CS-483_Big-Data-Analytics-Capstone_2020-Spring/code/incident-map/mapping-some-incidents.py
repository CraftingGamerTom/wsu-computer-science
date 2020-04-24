# Some sources
# https://medium.com/forsk-labs/creating-interactive-crime-maps-with-folium-18498d5866fe
# https://www.kaggle.com/uds5501/chicago-crime-mapping

start_date = '01-01-2019'
end_date = '12-31-2019'

df = crimes

mask = (df.index > start_date) & (df.index <= end_date)
df = df.loc[mask]

df = df.dropna()
df = df.drop(columns=['P_INCID_NO', 'IBR_TYPE'], axis = 1)

worcester_map = folium.Map(location=[42.2626,-71.8023], zoom_start=11, tiles="CartoDB dark_matter")

df['primary_address'] = (df['PRIMARY_STREET_NUM'].astype(str) + " " + df['PRIMARY_STREET_NAME'].astype(str))

primary_addresses = df['primary_address']

df['new_locations'] = list(zip(df.LATITUDE, df.LONGITUDE))
new_locations = df['new_locations']

for i in range(len(new_locations)):
    dfIndex = str(new_locations.index[i])
    dfRow = df[dfIndex].iloc[0]
    print(dfIndex)
    lat = new_locations.iloc[i][0]
    long = new_locations.iloc[i][1]
    popup_text = """Incident Info : {}<br>Date : {}<br>Address : {} {}<br>Location : {} {}<br>"""
    popup_text = popup_text.format(dfRow['IBR_TYPE_DESC'], dfIndex, dfRow['PRIMARY_STREET_NUM'], dfRow['PRIMARY_STREET_NAME'], new_locations.iloc[i][-1], new_locations.iloc[i][-2])
    folium.CircleMarker(location = [lat, long], popup= popup_text, fill = True).add_to(worcester_map)

worcester_map.save('/media/tcrokicki/MainDrive/temp-school/capstone/mapping-some-incidents.html')
