import pprint
import re

table = {'ID': [], 'struct_type': [], 'data_type': [], 'return_type': [], 'init_val': [], 'num_of_params': [], 'type_of_params': []}
types = ['int', 'String', 'bool']


f = open('test_yapl.txt', 'r')
lines = f.readlines()
f.close()

def Read_Function(sentence):
    print(sentence)
    params = []
    param_types = []

    l = sentence[3:]
    for i in range(len(l)):
        for i in range(len(l)):
            try:
                l.remove('')
            except:
                pass

    param_num = int(len(l)/2)

    for previous, current in zip(l, l[1:]):
        params.append([previous, current])

    for i in params:
        param_types.append(i[0])

    table['ID'].append(sentence[2].replace('\n', ''))
    table['struct_type'].append('Func')
    table['data_type'].append('----')
    table['return_type'].append(sentence[1])
    
    table['init_val'].append('----')
    table['num_of_params'].append(str(param_num))
    table['type_of_params'].append(param_types)
    


def Read_Variable(sentence):
    table['ID'].append(sentence[1].replace('\n', ''))
    table['struct_type'].append('Var')
    table['data_type'].append(sentence[0])
    table['return_type'].append('----')
    table['init_val'].append('null')
    table['num_of_params'].append('----')
    table['type_of_params'].append('----')
    
    for i in range(len(sentence)):
        if sentence[i] == '=':
            table['init_val'][-1] = sentence[i + 1].replace('\n', '')
    

for i in lines:
    i = i.replace('(', ' ')
    i = i.replace(')', ' ')
    i = i.replace('\n', ' ')
    i = i.replace(',', ' ')
    sentence = i.split(' ')
    for j in sentence:
        if 'Procedure' in j:
            Read_Function(sentence)

        if j in types and 'Procedure' not in sentence:
            Read_Variable(sentence)


table_keys = list(table)

c = 0
for each_row in zip(*([i] + (j)
                      for i, j in table.items())):
    row_tuple = ()
    
    for i in each_row:
        if c > 0:
            row_tuple += tuple(i)
            row_tuple += tuple('          ')
        else:
            row_tuple += tuple(i)
            row_tuple += tuple('    ')
    
    print(*row_tuple, "        ")
    if c < 1:
        print('----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------')
    c += 1

    
    