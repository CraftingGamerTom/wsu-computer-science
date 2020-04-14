# %%

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

#x = df.sample(30000) ##sampling a part of the dataset
x = df # We want the whole dataset not a sample

df.dropna(); ## drop rows with missing data

x_theft = x[x['IBR_TYPE_DESC'].isin(("Motor Vehicle Theft", "Credit Card/Automatic Teller Fraud", "Shoplifting", "Burglary/Breaking & Entering", "Robbery", "Theft from Motor Vehicle", "Theft from Building", "All Other Thefts"))]
x_battery = x[x['IBR_TYPE_DESC'].isin(("Simple Assault", "Aggravated Assault", "Forcible Fondling", "Assault - Intimidation")) ]
x_cd = x[x['IBR_TYPE_DESC'].isin(("Destruction/Damage/Vandalism of Property", "XXX"))]
x_narc = x[x['IBR_TYPE_DESC'].isin(("Drug/Narcotic Violations", "XXX"))]
x_prostitution = x[x['IBR_TYPE_DESC'].isin(("Prostitution", "XXX"))]

print("Heat map over cooridantes of crimes")
x.plot.hexbin(x='LONGITUDE', y='LATITUDE', gridsize=10)
plt.title("Overall crimes")
plt.show()

x_theft.plot.hexbin(x='LONGITUDE', y='LATITUDE', gridsize=40)
plt.title("Theft")

x_battery.plot.hexbin(x='LONGITUDE', y='LATITUDE', gridsize=40)
plt.title("Battery")

x_cd.plot.hexbin(x='LONGITUDE', y='LATITUDE', gridsize=40)
plt.title("Criminal Damage")
plt.show()

x_narc.plot.hexbin(x='LONGITUDE', y='LATITUDE', gridsize=40)
plt.title("Narcotics")
plt.show()

x_prostitution.plot.hexbin(x='LONGITUDE', y='LATITUDE', gridsize=40)
plt.title("Prostitution")
plt.show()

# %%
