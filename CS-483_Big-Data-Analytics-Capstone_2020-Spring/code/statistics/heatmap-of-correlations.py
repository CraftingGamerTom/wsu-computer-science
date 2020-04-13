def heatMap(df):
    #Create Correlation df
    corr = df.corr()
    #Plot figsize
    fig, ax = plt.subplots(figsize=(10, 10))
    #Generate Color Map, red & blue
    colormap = sns.diverging_palette(220, 10, as_cmap=True)
    #Generate Heat Map, allow annotations and place floats in map
    sns.heatmap(corr, cmap=colormap, annot=True, fmt=".2f")
    #Apply xticks
    plt.xticks(range(len(corr.columns)), corr.columns);
    #Apply yticks
    plt.yticks(range(len(corr.columns)), corr.columns)
    #show plot
    plt.show()

##find missing values
##plt.figure(figsize=(8,6))
##sns.heatmap(df.isnull(), cbar = False)
df.dropna(); ## drop rows with missing data
# convert dates to pandas datetime format
#df.ACTUAL_DTE = pd.to_datetime(df.ACTUAL_DTE, format='%m/%d/%Y %I:%M:%S %p')
df.ACTUAL_DTE = pd.to_datetime(df.ACTUAL_DTE, format='%Y-%m-%d %H:%M:%S')
df.index = pd.DatetimeIndex(df.ACTUAL_DTE)
x = df.sample(30000) ##sampling a part of the dataset
heatMap(x) ## correlation between variables

x['Primary Type'].value_counts().plot.bar()
plt.title("Crimes")
plt.show()

