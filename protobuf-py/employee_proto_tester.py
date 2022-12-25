import employees_pb2

# You may need to run 
# export PROTOCOL_BUFFERS_PYTHON_IMPLEMENTATION=python


employees = employees_pb2.EmployeeDB()

with open("employees.data","rb") as f:
    employees.ParseFromString(f.read())
    f.close()

print(employees)