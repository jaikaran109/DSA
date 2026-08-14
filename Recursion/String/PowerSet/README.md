# Phle left wala part execute hoga then Right wala

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/e4bc232e-c030-4727-b7fd-00cdd504fd93" />


subsets("", 0)
│
├── PICK 'a'
│   │
│   └── subsets("a", 1)
│       │
│       ├── PICK 'b'
│       │   │
│       │   └── subsets("ab", 2)
│       │       │
│       │       ├── PICK 'c'
│       │       │   └── subsets("abc", 3)
│       │       │       └── PRINT → abc
│       │       │
│       │       └── SKIP 'c'
│       │           └── subsets("ab", 3)
│       │               └── PRINT → ab
│       │
│       └── SKIP 'b'
│           │
│           └── subsets("a", 2)
│               │
│               ├── PICK 'c'
│               │   └── subsets("ac", 3)
│               │       └── PRINT → ac
│               │
│               └── SKIP 'c'
│                   └── subsets("a", 3)
│                       └── PRINT → a
│
└── SKIP 'a'
    │
    └── subsets("", 1)
        │
        ├── PICK 'b'
        │   │
        │   └── subsets("b", 2)
        │       │
        │       ├── PICK 'c'
        │       │   └── subsets("bc", 3)
        │       │       └── PRINT → bc
        │       │
        │       └── SKIP 'c'
        │           └── subsets("b", 3)
        │               └── PRINT → b
        │
        └── SKIP 'b'
            │
            └── subsets("", 2)
                │
                ├── PICK 'c'
                │   └── subsets("c", 3)
                │       └── PRINT → c
                │
                └── SKIP 'c'
                    └── subsets("", 3)
                        └── PRINT → "" (empty subset)



abc
ab
ac
a
bc
b
c
""
