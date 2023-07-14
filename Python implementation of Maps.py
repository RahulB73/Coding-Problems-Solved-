# Python implementation of Maps

my_dict ={}



print ("Enter key-value pairs (enter 'exit' to stop):") 
while True :
  key = input ("Enter key: ") 
  if key == 'exit':
    break
      
  value = input ("Enter value: ")
  my_dict[key] = value
  
print ("\nKey-value pairs in the dictionary:") 
for key , value in my_dict.items ():
    print ("Key:", key, "Value:", value)
