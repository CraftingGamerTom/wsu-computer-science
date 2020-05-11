# https://www.kaggle.com/uds5501/chicago-crime-mapping

plt.figure(figsize=(10,7))
sns.heatmap(crimes.isnull(), cbar = False, cmap = 'viridis').set_title("Null Values Visualized")
plt.show()