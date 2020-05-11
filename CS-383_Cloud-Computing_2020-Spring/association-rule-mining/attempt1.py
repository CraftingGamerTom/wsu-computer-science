# ----------------------------------------------------------------
# ---------- ASSOCIATION RULE MINING : NOTEABLE ATTEMPT 1 ---------
# ----------------------------------------------------------------

# ------------------ DAILY DATASET --------------------

records = []
for i in range(0, 186123):
 records.append([str(dailyRankedCrimes.values[i,j]) for j in range(0, 4)])
 if(i%10000 == 0):
        print(i)

print("Created daily records")

# At this point it ran for many hours (on mny local machine) and never finished (not parallized) but on a i7 CPU with 16 GB of RAM
# We found that python arrays were just too inefficient 

association_rules = apriori(dailyRankedCrimes, min_support=0.2, min_confidence=0.95, min_lift=3, min_length=4)
association_results = list(association_rules)
print(len(association_results))

# ------------------ YEARLY DATASET --------------------

# Before deciding it was too inefficient I decided to try it with a smaller dataset - the Yearly Ranked Crimes Data

records = []
for i in range(0, 6961):
 records.append([str(yearlyRankedCrimes.values[i,j]) for j in range(0, 5)])

association_rules = apriori(yearlyRankedCrimes, min_support=0.0045, min_confidence=0.95, min_lift=3, min_length=2)
association_results = list(association_rules)
print(len(association_results))
# 8741

# That is too many rules. I messed around with the variables and repeated
association_rules = apriori(rankedCrimes, min_support=0.2, min_confidence=0.95, min_lift=3, min_length=4)
association_results = list(association_rules)
print(len(association_results))
# 9

# I printed the Rules using the common commands (found in common-commands.py)


