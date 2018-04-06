def list_powerset(lst): 
       result = [[]] 
       for x in lst: 
        result.extend([subset + [x] for subset in result]) 
       return result 
  
Or 

def list_powerset2(lst): 
      return reduce(lambda result, x: result + [subset + [x] for subset in result],          lst, [[]]) 
  
Or 

def powerset(s):
     return frozenset(map(frozenset, list_powerset(list(s)))) 
