Here is your complete **GitHub-ready `README.md`** in clean, beautiful Markdown format 👇
You can copy-paste this directly into your `README.md` file.

---

````markdown
# 🔥 Complete Guide to HashMap in Java (Basics → Advanced for DSA & LeetCode)

HashMap is one of the most powerful and important data structures in Java for:

- ✅ Data Structures & Algorithms  
- ✅ LeetCode Contests  
- ✅ Coding Interviews  
- ✅ Competitive Programming  

---

# 📌 1. What is a HashMap?

A `HashMap<K, V>` stores **key–value pairs**.

- 🔹 Each key is **unique**
- 🔹 Each key maps to exactly **one value**
- 🔹 Values can be duplicate
- 🔹 Average Time Complexity → **O(1)**

---

# 🏗 2. Creating a HashMap

```java
import java.util.HashMap;

HashMap<String, Integer> map = new HashMap<>();
````

With capacity:

```java
HashMap<Integer, Integer> map = new HashMap<>(16);
```

With capacity + load factor:

```java
HashMap<Integer, Integer> map = new HashMap<>(16, 0.75f);
```

---

# ⚙ 3. How HashMap Works Internally

### 1️⃣ Hashing

Each key generates a `hashCode()`.

### 2️⃣ Bucket Array

Index is calculated using:

```
index = hash % capacity
```

### 3️⃣ Collision Handling

If two keys land in the same bucket:

* 🔹 Before Java 8 → Linked List
* 🔹 After Java 8 → Linked List → Converts to Red-Black Tree (if large)

---

# ⏱ 4. Time Complexity

| Operation | Average | Worst Case |
| --------- | ------- | ---------- |
| put()     | O(1)    | O(log n)   |
| get()     | O(1)    | O(log n)   |
| remove()  | O(1)    | O(log n)   |

---

# 🧰 5. All Important HashMap Methods (DSA Focused)

---

## 🔹 put(K key, V value)

```java
map.put(1, 10);
```

---

## 🔹 get(K key)

```java
map.get(1);
```

Returns value or `null`.

---

## 🔹 getOrDefault(K key, V defaultValue) ⭐ VERY IMPORTANT

```java
map.getOrDefault(num, 0);
```

Used for frequency counting:

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

---

## 🔹 containsKey(K key)

```java
map.containsKey(5);
```

Used in Two Sum and lookup problems.

---

## 🔹 containsValue(V value)

⚠ O(n) — Avoid in contests.

---

## 🔹 remove(K key)

```java
map.remove(5);
```

---

## 🔹 size()

```java
map.size();
```

---

## 🔹 isEmpty()

```java
map.isEmpty();
```

---

## 🔹 clear()

```java
map.clear();
```

---

## 🔹 keySet()

```java
for(int key : map.keySet()) {
}
```

---

## 🔹 values()

```java
for(int value : map.values()) {
}
```

---

## 🔹 entrySet() ⭐ BEST PRACTICE

```java
for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int key = entry.getKey();
    int value = entry.getValue();
}
```

---

## 🔹 putIfAbsent()

```java
map.putIfAbsent(1, 100);
```

---

## 🔹 replace()

```java
map.replace(1, 50);
```

---

## 🔹 merge() ⭐ Advanced & Powerful

```java
map.merge(key, 1, Integer::sum);
```

Frequency counting in one line.

---

# 🧠 6. Important DSA Patterns Using HashMap

---

# 🔥 Pattern 1: Frequency Counter

```java
HashMap<Integer, Integer> freq = new HashMap<>();

for(int num : nums) {
    freq.put(num, freq.getOrDefault(num, 0) + 1);
}
```

Used in:

* Anagrams
* Majority Element
* Top K Frequent Elements

---

# 🔥 Pattern 2: Two Sum

```java
HashMap<Integer, Integer> map = new HashMap<>();

for(int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];

    if(map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
    }

    map.put(nums[i], i);
}
```

Time Complexity: **O(n)**

---

# 🔥 Pattern 3: Prefix Sum + HashMap

Used in:

* Subarray Sum Equals K
* Longest Subarray Problems

```java
HashMap<Integer, Integer> map = new HashMap<>();
map.put(0, 1);

int sum = 0;
int count = 0;

for(int num : nums) {
    sum += num;

    if(map.containsKey(sum - k)) {
        count += map.get(sum - k);
    }

    map.put(sum, map.getOrDefault(sum, 0) + 1);
}
```

---

# 🔥 Pattern 4: Character Mapping (Strings)

```java
HashMap<Character, Integer> map = new HashMap<>();
```

Used in:

* Valid Anagram
* First Unique Character
* Longest Substring Without Repeating Characters

---

# 🆚 7. HashMap vs LinkedHashMap vs TreeMap

| Feature   | HashMap    | LinkedHashMap     | TreeMap        |
| --------- | ---------- | ----------------- | -------------- |
| Order     | ❌ No       | ✅ Insertion Order | ✅ Sorted       |
| Time      | O(1)       | O(1)              | O(log n)       |
| Structure | Hash Table | Hash Table + List | Red-Black Tree |

---

# 🔐 8. Rules for Custom Keys

If using custom objects as keys:

You MUST override:

* `hashCode()`
* `equals()`

Example:

```java
@Override
public int hashCode() {
    return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || getClass() != obj.getClass()) return false;
    MyClass other = (MyClass) obj;
    return id == other.id;
}
```

---

# ⚡ 9. Internal Details (Interview Important)

* Default Capacity → **16**
* Default Load Factor → **0.75**
* Rehashing occurs when:

```
size > capacity × loadFactor
```

* Not Thread-Safe ❌
  Use `ConcurrentHashMap` for multi-threading.

---

# 🚀 10. Pro-Level LeetCode Tips

✅ Prefer `getOrDefault()` over `containsKey() + get()`
✅ Use `merge()` for clean frequency code
✅ Always initialize `map.put(0, 1)` in prefix sum problems
✅ Avoid `containsValue()`
✅ Remember: Keys must be unique

---

# 🎯 Final Summary

HashMap is used for:

* ✔ Fast Lookup
* ✔ Frequency Counting
* ✔ Complement Search
* ✔ Prefix Sum Problems
* ✔ Index Tracking
* ✔ String Character Mapping

Mastering HashMap = Solving 50% of LeetCode Medium Problems Easily 🚀

---

# 📚 Recommended Practice Problems

* Two Sum
* Valid Anagram
* Group Anagrams
* Subarray Sum Equals K
* Top K Frequent Elements
* Longest Substring Without Repeating Characters
* Majority Element

---

# 🏆 Conclusion

If you master:

* Internal Working
* All Core Methods
* DSA Patterns
* Prefix Sum + HashMap
* Frequency Techniques

You will dominate coding contests and interviews.

---

⭐ Happy Coding!

```

---

If you want, I can also:

- Make a **separate advanced README with diagrams**
- Add **visual bucket explanation**
- Create a **HashMap cheat sheet version (1-page quick revision)**
- Or generate a **complete DSA HashMap problem collection template**

Just tell me 🚀
```
