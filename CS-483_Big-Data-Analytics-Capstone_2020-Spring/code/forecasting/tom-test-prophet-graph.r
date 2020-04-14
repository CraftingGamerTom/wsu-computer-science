#install.packages('prophet', type="source")
#install.packages('magrittr', type="source")

library(prophet)
library(magrittr)

crimes2007_2018= read.csv("/Users/tcrokicki/Documents/WorcesterData.csv")
crimes2007_2018$ACTUAL_DTE <- as.Date(crimes2007_2018$ACTUAL_DTE, format = "%Y-%m-%d %H:%M:%S")
by_Date <- na.omit(crimes2007_2018) %>% group_by(ACTUAL_DTE) %>% summarise(Total = n())
tseries <- xts(by_Date$Total, order.by=as.POSIXct(by_Date$ACTUAL_DTE))
df <- crimes2007_2018 %>% group_by(ACTUAL_DTE) %>% summarise(y = n()) %>% mutate(y = log(y))
names(df) <- c("ds", "y")
df$ds <- factor(df$ds)
hchart(tseries, name = "Crimes") %>%
+   hc_add_theme(hc_theme_darkunica()) %>%
+   hc_credits(enabled = TRUE, text = "Sources: City of Worcester Administration and the Worcester Police Department", style = list(fontSize = "12px")) %>%
+   hc_title(text = "Times Series plot of Worcester Crimes") %>%
+   hc_legend(enabled = TRUE)