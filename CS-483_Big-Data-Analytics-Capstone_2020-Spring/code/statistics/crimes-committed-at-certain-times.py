# https://www.kaggle.com/coeyoner/chicago-crime-visualization

x = crimes
x = x.set_index(['ACTUAL_DTE'])

color = (0.2, 0.4, 0.6, 0.6)

bars = x['IBR_TYPE_DESC'].unique()
bars = bars.sort_values(inplace=True)

x[x.index.hour == 0]['IBR_TYPE_DESC'].value_counts(normalize=True).plot.bar(color=color)
plt.title("Crimes commited around 24:00")
plt.show()

x[x.index.hour == 3]['IBR_TYPE_DESC'].value_counts(normalize=True).plot.bar(color=color)
plt.title("Crimes commited around 03:00")
plt.show()

x[x.index.hour == 12]['IBR_TYPE_DESC'].value_counts(normalize=True).plot.bar(color=color)
plt.title("Crimes commited around 12:00")
plt.show()

x[x.index.hour == 19]['IBR_TYPE_DESC'].value_counts(normalize=True).plot.bar(color=color)
plt.title("Crimes commited around 19:00")
plt.show()