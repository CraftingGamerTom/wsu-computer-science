# https://www.kaggle.com/skeftical/chicago-crimes-eda-spatio-temporal

plt.figure(figsize=(12,12))
sns.jointplot(x=crimes['LATITUDE'].values, y=crimes['LONGITUDE'].values, size=10, kind='hex')
plt.ylabel('Longitude', fontsize=12)
plt.xlabel('Latitude', fontsize=12)
plt.show()