# https://www.kaggle.com/skeftical/chicago-crimes-eda-spatio-temporal

# Crime over time (by type)

# This is very resource intensive to run
crimes_count_date = crimes.pivot_table('P_INCID_NO', aggfunc=np.size, columns='IBR_TYPE', index=crimes.index, fill_value=0)
crimes_count_date.index = pd.DatetimeIndex(crimes_count_date.index)
plo = crimes_count_date.rolling(365).sum().plot(figsize=(12, 30), subplots=True, layout=(-1, 3), sharex=False, sharey=False)

plt.figure(figsize=(11,4))
crimes_count_date.resample('D').size().rolling(365).sum().plot()
plt.title('Rolling sum of all crimes from 2007 - 2018')
plt.ylabel('Number of crimes')
plt.xlabel('Days')
plt.show()