install.packages('prophet')
install.packages("highcharter")
library(dplyr)
library(prophet)
library(xts)
library(highcharter)
#loading the dataset
crimes <- read.csv("WorcesterData_03_19.csv")
#changing the data format
crimes$ACTUAL_DTE <- as.Date(crimes$ACTUAL_DTE, format = "%m/%d/%Y")
by_Date <- na.omit(crimes) %>% group_by(ACTUAL_DTE) %>% summarise(Total = n())
tseries <- xts(by_Date$Total, order.by=as.POSIXct(by_Date$ACTUAL_DTE))
 df <- crimes %>% group_by(ACTUAL_DTE) %>% summarise(y = n()) %>% mutate(y = log(y))
 names(df) <- c("ds", "y")
 df$ds <- factor(df$ds)
hchart(tseries, name = "Crimes Number") %>%
  hc_add_theme(hc_theme_darkunica()) %>%
  hc_credits(enabled = TRUE, text = "Sources: City of Worcester Administration and the Worcester Police Department", style = list(fontSize = "12px")) %>%
  hc_title(text = "Times Series plot of Worcester Crimes") %>%
  hc_legend(enabled = TRUE)