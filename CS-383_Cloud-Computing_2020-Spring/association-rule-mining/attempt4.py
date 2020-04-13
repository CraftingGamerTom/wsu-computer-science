# ----------------------------------------------------------------
# ---------- ASSOCATION RULE MINING : NOTEABLE ATTEMPT 4 ---------
# ----------------------------------------------------------------


# ------------------ DAILY DATASET --------------------

# Remove the RANK column
del dailyRankedCrimes['WEIGHTED_INCIDENT_SCORE']

association_rules = apriori(dailyRankedCrimes.values, min_support=0.00045, min_confidence=0.95, min_lift=3, min_length=2, use_colnames = True)
association_results = list(association_rules)
print(len(association_results))
# 1

# Adjust Settings
association_rules = apriori(dailyRankedCrimes.values, min_support=0.00025, min_confidence=0.95, min_lift=3, min_length=2, use_colnames = True)
association_results = list(association_rules)
print(len(association_results))
# 5

# ------------------ YEARLY DATASET --------------------

# Remove the RANK column
del yearlyRankedCrimes['WEIGHTED_INCIDENT_SCORE']

association_rules = apriori(yearlyRankedCrimes.values, min_support=0.05, min_confidence=0.95, min_lift=3, min_length=2, use_colnames = True)
association_results = list(association_rules)
print(len(association_results))
# 0

# Adjust settings
association_rules = apriori(yearlyRankedCrimes.values, min_support=0.00045, min_confidence=0.95, min_lift=3, min_length=2, use_colnames = True)
association_results = list(association_rules)
print(len(association_results))
# 9

