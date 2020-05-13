#Locations with most crimes
hchart(by_location[1:20,], "column", hcaes(x = PRIMARY_STREET_NAME, y = Total, color = Total)) %>%
  hc_colorAxis(stops = color_stops(n = 10, colors = c("#440154", "#21908C", "#FDE725"))) %>%
  hc_add_theme(hc_theme_darkunica()) %>%
  hc_title(text = "Locations with most Crimes - Top 20") %>%
  hc_credits(enabled = TRUE, text = "Sources: City of Worcester Administration and the Worcester Police Department", style = list(fontSize = "12px")) %>%
  hc_legend(enabled = FALSE)