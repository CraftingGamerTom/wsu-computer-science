crimes = crimes.dropna()
df = crimes.drop(columns=['Unnamed: 0', 'P_INCID_NO', 'IBR_TYPE'], axis = 1)

# Plot by location
plt.figure(figsize = (15, 10))
sns.countplot(y= 'PRIMARY_STREET_NAME', data = df, order = df['PRIMARY_STREET_NAME'].value_counts().iloc[:10].index)
plt.show()