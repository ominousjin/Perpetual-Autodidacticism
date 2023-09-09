# Java

Reference: [Java Full Course by Bro Code (YT)](https://www.youtube.com/watch?v=xk4_1vDrzzo)

```
- Computer languages are on a spectrum between being high-level and low-level.
- Computers only understand binary and it's referred to as machine code.
  |--> It's a low level format that a machine can understand.
- However, it's difficult for humans to read binary, since it's all ones and zeroes.
- To create machine code, we write in a format called source code.
  |--> Source code is understandable by humans and it's compiled to a machine code.
```

![image](https://github.com/akarsh0913/Perpetual-Autodidacticism/assets/134067749/2fa7893d-a769-4616-967f-6d6d3d969dff)

<ul>
<li>When we create java source code, the file ends with a `.java` file extension.</li>
<li>Compiling code is basically transforming source code to mahcine code.</li>
<li>This is because, machines can't read source code and vice versa.</li>
</ul>

```
- When we compile our source code to machine code, it's machine specific.
- If we write source code and compile it on a mac, we can only run that code on a Mac 
  |--> and same goes for others.
```

However, Java has a solution to this problem:
<ul>
<li>With Java, we have an intermediary step, where we can compile source code to a format called byte code.</li>
<li>Byte code is cross-platform and ends with a `.class` file extension.</li>
<li>A byte code file that was generated on a Mac can also be executed in a Windows PC using a JVM.</li>
</ul>

```
- JVM translates the byte code to machine code.
- A JVM (Java Virtual Machine) is included with a JDK.
- And, JDK is an acronym for Java Development Kit.
- It contains developer tools to help us code as well as a JRE.
- JRE (Java Runtime Environment) which contains a library, toolkits and JVM.
```
