#forecasting Crimes
m <- prophet(df)
future <- make_future_dataframe(m, periods = 365 * 4)
head(future)
tail(future)
forecast <- predict(m, future)
tail(forecast[c('ds', 'yhat', 'yhat_lower', 'yhat_upper')])
plot(m, forecast)
prophet_plot_components(m, forecast)