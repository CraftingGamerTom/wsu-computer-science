# https://www.kaggle.com/coeyoner/chicago-crime-visualization

color = (0.2, 0.4, 0.6, 0.6)

days = ['Monday','Tuesday','Wednesday',  'Thursday', 'Friday', 'Saturday', 'Sunday']
x.groupby([x.index.dayofweek]).size().plot(kind='barh', color=color)
plt.ylabel('Day of week')
plt.yticks(np.arange(7), days)
plt.xlabel('Number of crimes')
plt.title('Number of crimes by day of week')
plt.show()