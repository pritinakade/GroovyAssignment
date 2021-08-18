package GroovyAssignment

List Names=['Priti','Khushi' ,'Pooname','Krutika' ,'Utkarsh', 'Robin']
println Names.sort()
List sort=Names.sort{it.size()}
println sort
println sort.reverse()
