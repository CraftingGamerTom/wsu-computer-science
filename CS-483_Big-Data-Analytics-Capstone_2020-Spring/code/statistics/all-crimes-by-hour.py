# https://www.kaggle.com/txp142130/utd-crimes-in-chicago-with-choropleth-map

df_crime = crimes

df_crime.groupby([df_crime['ACTUAL_DTE'].dt.hour,'IBR_TYPE_DESC',])['P_INCID_NO'].count().unstack().plot(marker='o')
plt.ylabel('Number of Crimes')
plt.xlabel('Hours of the day')
plt.xticks(np.arange(24))
plt.show()