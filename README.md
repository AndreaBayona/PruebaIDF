# PruebaIDF
Complejidad: 
n = Cantidad inicial de niños

m = Cantidad maxima de niños

n <= m

Parte 1
Primero se realiza una iteración sobre la lista de niños O(n) y por cada niño, se añade su cantidad de dulces a una cola de prioridad O(log(n)). 
Por tanto, la primera parte de la solución tiene complejidad O(nlog(n)).

Parte 2
El calculo de IDF, recorre de nuevo toda la lista de niños, O(m), y por cada uno realiza la operación Poll, que es O(log(m)). 
Cada niño puede añadir un amigo a la cola de prioridad, esta complejidad es de O(log(m)). 
A pesar de que cada niño puede añadir más amigos, solo se realizan m iteraciones, por la condicion de parada. 
La complidad será O(m*2log(m)) = O(mlog(m)).

La complejidad final será de O(nlog(n) + mlog(m)), y como n <= m, entonces será O(2mlog(m)) = O(mlog(m)). 



