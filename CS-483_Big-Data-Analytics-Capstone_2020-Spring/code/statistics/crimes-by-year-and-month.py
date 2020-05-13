### Working with Date and Time
crimes$Day <- factor(day(as.POSIXlt(crimes$ACTUAL_DTE, format = "%m/%d/%Y")))
crimes$Month <- factor(month(as.POSIXlt(crimes$ACTUAL_DTE, format = "%m/%d/%Y"), label = TRUE))
crimes$Year <- factor(year(as.POSIXlt(crimes$ACTUAL_DTE, format = "%m/%d/%Y")))
crimes$Weekday <- factor(wday(as.POSIXlt(crimes$ACTUAL_DTE, format = "%m/%d/%Y"), label = TRUE))
crimes$Date <- as.Date(crimes$ACTUAL_DTE, format = "%m/%d/%Y")
## Creating timeseries
by_Date <- na.omit(crimes) %>% group_by(ACTUAL_DTE) %>% summarise(Total = n())
tseries <- xts(by_Date$Total, order.by=as.POSIXct(by_Date$ACTUAL_DTE))
## BY Location
by_location <- crimes %>% group_by(PRIMARY_STREET_NAME) %>% summarise(Total = n()) %>% arrange(desc(Total))
## By Primary Type
by_type <- crimes %>% group_by(IBR_TYPE_DESC) %>% summarise(Total = n()) %>% arrange(desc(Total))
## By Year
by_year <- crimes %>% group_by(Year) %>% summarise(Total = n()) %>% arrange(desc(Total))
## Lat and Long of Crimes
LatLonCounts <- as.data.frame(table(round(crimes$LONGITUDE,2), round(crimes$LATITUDE,2)))
LatLonCounts$Long <- as.numeric(as.character(LatLonCounts$Var1))
LatLonCounts$Lat <- as.numeric(as.character(LatLonCounts$Var2))
LatLonCounts2 <- subset(LatLonCounts, Freq > 0)
##Crimes by year and month
crime_count <- crimes %>% group_by(Year, Month) %>% summarise(Total = n())
crimes2 <- ggplot(crime_count, aes(Year, Month, fill = Total)) +
  geom_tile(size = 1, color = "white") +
  scale_fill_viridis()  +
  geom_text(aes(label=Total), color='white') +
  ggtitle("Crimes by Year and Month(2003-2019)")

grid.arrange(crimes2, ncol = 1)