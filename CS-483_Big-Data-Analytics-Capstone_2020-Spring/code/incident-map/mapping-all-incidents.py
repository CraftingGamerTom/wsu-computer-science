df = crimes.dropna()
df = df.drop(columns=['P_INCID_NO', 'IBR_TYPE'], axis = 1)

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

worcester_map.save('/media/tcrokicki/MainDrive/temp-school/capstone/crime_data.html')