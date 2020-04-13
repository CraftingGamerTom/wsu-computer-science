#%%

# Crime over time
plt.figure(figsize=(11,4))
crimes.resample('D').size().rolling(365).sum().plot()
plt.title('Rolling sum of all crimes from 2007 - 2018')
plt.ylabel('Number of crimes')
plt.xlabel('Days')
plt.show()

print('Dataset Shape after drop_duplicate: ', crimes.shape)

# %%
