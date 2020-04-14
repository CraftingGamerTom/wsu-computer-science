df = crimes

df = df.dropna(); ## drop rows with missing data

#x = df.sample(30000) ##sampling a part of the dataset
#x['IBR_TYPE_DESC'].value_counts().plot.bar()

df['IBR_TYPE_DESC'].value_counts().plot.bar()

plt.title("Crimes")
plt.show()