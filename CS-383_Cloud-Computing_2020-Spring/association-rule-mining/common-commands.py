# ----------------------------------------------------------------
# ---------- COMMON COMMANDS AFTER GENERATING THE RULES ----------
# ----------------------------------------------------------------

# View number of Rules
print(len(association_results))

# View first Rule
print(association_results[0])

# Print all rules
for item in association_results:
 # first index of the inner list
 # Contains base item and add item
 pair = item[0] 
 items = [x for x in pair]
 #print("Rule: " + items[0] + " -> " + items[1])
 print("Rule: " + str(list(item.ordered_statistics[0].items_base)) + " -> " + str(list(item.ordered_statistics[0].items_add)))
 #second index of the inner list
 print("Support: " + str(item[1]))
 #third index of the list located at 0th
 #of the third index of the inner list
 print("Confidence: " + str(item[2][0][2]))
 print("Lift: " + str(item[2][0][3]))
 print("=====================================")