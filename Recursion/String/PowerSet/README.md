# Phle left wala part execute hoga then Right wala

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/e4bc232e-c030-4727-b7fd-00cdd504fd93" />
subsets("",0)
    ↓ PICK
subsets("a",1)
    ↓ PICK
subsets("ab",2)
    ↓ PICK
subsets("abc",3)
    ↓
PRINT abc
    ↓ RETURN
subsets("ab",2)
    ↓ SKIP
subsets("ab",3)
    ↓
PRINT ab
    ↓ RETURN
subsets("ab",2) COMPLETE
    ↓ RETURN
subsets("a",1)
    ↓ SKIP
subsets("a",2)
    ↓ PICK
subsets("ac",3)
    ↓
PRINT ac
    ↓ RETURN
subsets("a",2)
    ↓ SKIP
subsets("a",3)
    ↓
PRINT a
    ↓ RETURN
subsets("a",2) COMPLETE
    ↓ RETURN
subsets("a",1) COMPLETE
    ↓ RETURN
subsets("",0)
    ↓ SKIP
subsets("",1)
    ↓ PICK
subsets("b",2)
    ↓ PICK
subsets("bc",3)
    ↓
PRINT bc
    ↓ RETURN
subsets("b",2)
    ↓ SKIP
subsets("b",3)
    ↓
PRINT b
    ↓ RETURN
subsets("b",2) COMPLETE
    ↓ RETURN
subsets("",1)
    ↓ SKIP
subsets("",2)
    ↓ PICK
subsets("c",3)
    ↓
PRINT c
    ↓ RETURN
subsets("",2)
    ↓ SKIP
subsets("",3)
    ↓
PRINT ""
    ↓ RETURN
DONE
