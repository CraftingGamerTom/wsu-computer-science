#%%

# Crime over time
plt.figure(figsize=(11,4))
crimes.resample('D').size().rolling(365).sum().plot()
plt.title('Rolling Sum of All Crimes')
plt.ylabel('Number of Crimes')
plt.xlabel('Days')
plt.show()

print('Dataset Shape after drop_duplicate: ', crimes.shape)

# %%
