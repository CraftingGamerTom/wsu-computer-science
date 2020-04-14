crimes = crimes.dropna()
df = crimes.drop(columns=['Unnamed: 0', 'P_INCID_NO', 'IBR_TYPE'], axis = 1)

# Print Locations
pd.value_counts(df['PRIMARY_STREET_NAME'])[:10]

# Print Types
pd.value_counts(df['IBR_TYPE_DESC'])[:10]

# Print Top 10 Addresses for Crime
pd.value_counts(df['PRIMARY_STREET_NUM'].astype(str) + ' ' + df['PRIMARY_STREET_NAME'].astype(str))[:10]
