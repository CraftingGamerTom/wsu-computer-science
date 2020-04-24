# https://www.kaggle.com/coeyoner/chicago-crime-visualization

color = (0.2, 0.4, 0.6, 0.6)

x.groupby([x.index.month]).size().plot(kind='barh', color=color)
plt.ylabel('Month')
plt.xlabel('Number of crimes')
plt.title('Number of crimes by month of year')
plt.show()