# https://www.kaggle.com/coeyoner/chicago-crime-visualization

color = (0.2, 0.4, 0.6, 0.6)

x.groupby([x.index.hour]).size().plot(kind='barh', color=color)
plt.ylabel('Hour')
plt.xlabel('Number of crimes')
plt.title('Number of crimes by hour of day')
plt.show()