## By Primary Type
by_type <- crimes %>% group_by(IBR_TYPE_DESC) %>% summarise(Total = n()) %>% arrange(desc(Total))

##Crime types
hchart(by_type, "column", hcaes(IBR_TYPE_DESC, y = Total, color = Total)) %>%
  hc_colorAxis(stops = color_stops(n = 10, colors = c("#440154", "#21908C", "#FDE725"))) %>%
  hc_add_theme(hc_theme_darkunica()) %>%
  hc_title(text = "Crime Types") %>%
  hc_credits(enabled = TRUE, text = " Sources: City of Worcester Administration and the Worcester Police Department ", style = list(fontSize = "12px")) %>%
  hc_legend(enabled = FALSE)