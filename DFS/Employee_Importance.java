/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int res = 0;
        
        Employee leader = find(employees, id);
        
        res = res + leader.importance;
        
        for (int i: leader.subordinates) {
            res = res + getImportance(employees, i);
        }
        
        return res;
    }
    
    public Employee find(List<Employee> employees, int id) {
        for (Employee em : employees) {
            if (em.id == id) {
                return em;
            }
        }
        
        return null;
    }
}
