
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


# Total Precipitation vs Incidents
plt.scatter(result_violent['Total Precipitation (in)'], result_violent['Incidents'], alpha=alpha, c='r', label='Violent')
plt.scatter(result_property['Total Precipitation (in)'], result_property['Incidents'], alpha=alpha, c='g', label='Property')
plt.scatter(result_nonViolent['Total Precipitation (in)'], result_nonViolent['Incidents'], alpha=alpha, c='y', label='Non Violent')
plt.scatter(result_whiteCollar['Total Precipitation (in)'], result_whiteCollar['Incidents'], alpha=alpha, c='b', label='White Collar')
plt.scatter(result_lowRisk['Total Precipitation (in)'], result_lowRisk['Incidents'], alpha=alpha, c='c', label='Low Risk')
plt.scatter(result_other['Total Precipitation (in)'], result_other['Incidents'], alpha=alpha, c='k', label='Other/Unknown')
plt.legend()
plt.title("Total Precipitation vs Incident Count")
plt.xlabel("Total Precipitation (in)")
plt.ylabel("Incidents")

X, pred = createLinearRegression(result_violent['Total Precipitation (in)'], result_violent['Incidents'])
plt.plot(X, pred, color='r')
X, pred = createLinearRegression(result_property['Total Precipitation (in)'], result_property['Incidents'])
plt.plot(X, pred, color='g')
X, pred = createLinearRegression(result_nonViolent['Total Precipitation (in)'], result_nonViolent['Incidents'])
plt.plot(X, pred, color='y')
X, pred = createLinearRegression(result_whiteCollar['Total Precipitation (in)'], result_whiteCollar['Incidents'])
plt.plot(X, pred, color='b')
X, pred = createLinearRegression(result_lowRisk['Total Precipitation (in)'], result_lowRisk['Incidents'])
plt.plot(X, pred, color='c')
X, pred = createLinearRegression(result_other['Total Precipitation (in)'], result_other['Incidents'])
plt.plot(X, pred, color='k')

plt.show()

# Temperature Density Plot
result_violent.plot(x='Avg. Temp (F)', y='Incidents', c='r', label='Violent')
result_property.plot(x='Avg. Temp (F)', y='Incidents', c='g', label='Property')
result_nonViolent.plot(x='Avg. Temp (F)', y='Incidents', c='y', label='Non Violent')
result_whiteCollar.plot(x='Avg. Temp (F)', y='Incidents', c='b', label='White Collar')
result_lowRisk.plot(x='Avg. Temp (F)', y='Incidents', c='c', label='Low Risk')
result_other.plot(x='Avg. Temp (F)', y='Incidents', c='k', label='Other/Unknown')
plt.legend()
plt.title("Avg Temperature vs Incident Count - Density Plot")
plt.xlabel("Incidents")
plt.ylabel("Avg. Temp (F)")
plt.show()