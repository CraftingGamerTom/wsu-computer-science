# ----------------------------------------------------------------
# ---------- ASSOCIATION RULE MINING : NOTEABLE ATTEMPT 3 ---------
# ----------------------------------------------------------------


# ------------------ DAILY DATASET --------------------

# Remove the RANK column
del dailyRankedCrimes['RANK']

association_rules = apriori(dailyRankedCrimes.values, min_support=0.00045, min_confidence=0.8, min_lift=3, min_length=2, use_colnames = True)
association_results = list(association_rules)
print(len(association_results))
# 0

# Adjust settings
association_rules = apriori(yearlyRankedCrimes.values, min_support=0.00025, min_confidence=0.95, min_lift=3, min_length=2, use_colnames = True)
association_results = list(association_rules)
print(len(association_results))
# 5


# ------------------ YEARLY DATASET --------------------

# Remove the RANK column
del yearlyRankedCrimes['RANK']

association_rules = apriori(yearlyRankedCrimes.values, min_support=0.02, min_confidence=0.95, min_lift=3, min_length=4, use_colnames = True)
association_results = list(association_rules)
print(len(association_results))
# 0

# Adjust settings
association_rules = apriori(yearlyRankedCrimes.values, min_support=0.00045, min_confidence=0.8, min_lift=3, min_length=2, use_colnames = True)
association_results = list(association_rules)
print(len(association_results))
# 16