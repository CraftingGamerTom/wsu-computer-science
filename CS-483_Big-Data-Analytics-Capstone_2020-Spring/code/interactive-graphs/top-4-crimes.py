##Crime types
hchart(by_type, "column", hcaes(IBR_TYPE_DESC, y = Total, color = Total)) %>%
  hc_colorAxis(stops = color_stops(n = 10, colors = c("#440154", "#21908C", "#FDE725"))) %>%
  hc_add_theme(hc_theme_darkunica()) %>%
  hc_title(text = "Crime Types") %>%
  hc_credits(enabled = TRUE, text = " Sources: City of Worcester Administration and the Worcester Police Department ", style = list(fontSize = "12px")) %>%
  hc_legend(enabled = FALSE)

##top crimes time series

damage<- crimes[crimes$IBR_TYPE_DESC=="Destruction/Damage/Vandalism of Property",] 
## Creating timeseries
damage_by_Date <- na.omit(damage) %>% group_by(ACTUAL_DTE) %>% summarise(Total = n())
damage_tseries <- xts(damage_by_Date$Total, order.by=as.POSIXct(damage_by_Date$ACTUAL_DTE))

assault <- crimes[crimes$IBR_TYPE_DESC =="Simple Assault",] 
## Creating timeseries
assault_by_Date <- na.omit(assault) %>% group_by(ACTUAL_DTE) %>% summarise(Total = n())
assault_tseries <- xts(assault_by_Date$Total, order.by=as.POSIXct(assault_by_Date$ACTUAL_DTE))


burglary <- crimes[crimes$IBR_TYPE_DESC =="Burglary/Breaking & Entering",]
## Creating timeseries
burglary_by_Date <- na.omit(burglary) %>% group_by(ACTUAL_DTE) %>% summarise(Total = n())
burglary_tseries <- xts(burglary_by_Date$Total, order.by=as.POSIXct(burglary_by_Date$ACTUAL_DTE))



other <- crimes[crimes$IBR_TYPE_DESC =="All Other Thefts",] 
## Creating timeseries
other_by_Date <- na.omit(other) %>% group_by(ACTUAL_DTE) %>% summarise(Total = n())
other_tseries <- xts(other_by_Date$Total, order.by=as.POSIXct(other_by_Date$ACTUAL_DTE))

hchart(damage_tseries, name = "Destruction/Damage/Vandalism of Property") %>% 
  hc_add_series(assault_tseries, name = "Simple Assault") %>% 
  hc_add_series(burglary_tseries, name = "Burglary/Breaking & Entering") %>%
  hc_add_series(other_tseries, name = "All Other Thefts") %>%
  hc_add_theme(hc_theme_darkunica()) %>%
  hc_credits(enabled = TRUE, text = "Sources: City of Worcester Administration and the Worcester Police Department", style = list(fontSize = "12px")) %>%
  hc_title(text = "Crimes in (Destruction/Damage/Vandalism of Property)/ Simple Assault/(Burglary/Breaking & Entering )/ All Other Thefts ") %>%
  hc_legend(enabled = TRUE)