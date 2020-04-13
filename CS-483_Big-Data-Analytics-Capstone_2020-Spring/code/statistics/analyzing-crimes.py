# Crimes per month
plt.figure(figsize=(11,5))
crimes.resample('M').size().plot(legend=False)
plt.title('Number of crimes per month (2017 - 2018)')
plt.xlabel('Months')
plt.ylabel('Number of crimes')
plt.show

# Crime over time
plt.figure(figsize=(11,4))
crimes.resample('D').size().rolling(365).sum().plot()
plt.title('Rolling sum of all crimes from 2017 - 2018')
plt.ylabel('Number of crimes')
plt.xlabel('Days')
plt.show()

crimes_count_date = crimes.pivot_table('P_INCID_NO', aggfunc=np.size, columns='IBR_TYPE', index=crimes.index.ACTUAL_DTE, fill_value=0)
crimes_count_date.index = pd.DatetimeIndex(crimes_count_date.index)
plo = crimes_count_date.rolling(365).sum().plot(figsize=(12, 30), subplots=True, layout=(-1, 3), sharex=False, sharey=False)