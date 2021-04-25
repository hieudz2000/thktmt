#You are given an array of integers. On each move you are allowed to increase exactly one of its elements by one. 
#Find the minimal number of moves required to obtain a strictly increasing sequence from the input.  
.data
Array:	.word	1, 1, 1
.text
main:	
	la $a0, Array
	li $a1, 3
	la $t0, 0	#count
	la $s0, 0	#sum
	la $t1, 0	#i
	j loop
	nop
loop:
	slt $t6, $t1, $a1
	beq $t6, 0, end
	add $t0, $0, $0
	add $t2, $t1, $t1
	add $t2, $t2, $t2
	add $t3, $t2, $a0
	lw  $t5, 0($t3)
	beq $t1, $0, next
	slt $t6, $t4, $t5
	beq $t6, 1, loop
	j 	tinh
next:
	add $t1, $t1, 1
	add $t4, $t5, $0
	j loop
tinh:
	sub $t0, $t4, $t5
	add $t0, $t0, 1
	add $s0, $s0, $t0
	add $t5, $t5, $t0
	j   next
end:
