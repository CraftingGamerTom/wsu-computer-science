# https://www.kaggle.com/samgdotson/is-crime-a-function-of-extreme-weather

# Temperature vs Incidents
plt.scatter(result_violent['Avg. Temp (F)'], result_violent['Incidents'], alpha=alpha, c='r', label='Violent')
plt.scatter(result_property['Avg. Temp (F)'], result_property['Incidents'], alpha=alpha, c='g', label='Property')
plt.scatter(result_nonViolent['Avg. Temp (F)'], result_nonViolent['Incidents'], alpha=alpha, c='y', label='Non Violent')
plt.scatter(result_whiteCollar['Avg. Temp (F)'], result_whiteCollar['Incidents'], alpha=alpha, c='b', label='White Collar')
plt.scatter(result_lowRisk['Avg. Temp (F)'], result_lowRisk['Incidents'], alpha=alpha, c='c', label='Low Risk')
plt.scatter(result_other['Avg. Temp (F)'], result_other['Incidents'], alpha=alpha, c='k', label='Other/Unknown')
plt.legend()
plt.title("Avg Temperature vs Incident Count")
plt.xlabel("Incidents")
plt.ylabel("Avg. Temp (F)")

X, pred = createLinearRegression(result_violent['Avg. Temp (F)'], result_violent['Incidents'])
plt.plot(X, pred, color='r')
X, pred = createLinearRegression(result_property['Avg. Temp (F)'], result_property['Incidents'])
plt.plot(X, pred, color='g')
X, pred = createLinearRegression(result_nonViolent['Avg. Temp (F)'], result_nonViolent['Incidents'])
plt.plot(X, pred, color='y')
X, pred = createLinearRegression(result_whiteCollar['Avg. Temp (F)'], result_whiteCollar['Incidents'])
plt.plot(X, pred, color='b')
X, pred = createLinearRegression(result_lowRisk['Avg. Temp (F)'], result_lowRisk['Incidents'])
plt.plot(X, pred, color='c')
X, pred = createLinearRegression(result_other['Avg. Temp (F)'], result_other['Incidents'])
plt.plot(X, pred, color='k')

plt.show()