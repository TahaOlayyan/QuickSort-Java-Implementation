\# Quick Sort Algorithm Implementation 🚀



\## الفرز السريع (Quick Sort): تطبيق بلغة Java



هذا المشروع يقدّم تطبيقاً فعالاً ونظيفاً لخوارزمية \*\*الفرز السريع (Quick Sort)\*\* بلغة \*\*Java\*\*. تُعد Quick Sort واحدة من أسرع خوارزميات الترتيب التي تعتمد على مبدأ "\*\*قسّم تسُد\*\*" وتُستخدم بشكل واسع في تطبيقات علوم الحاسوب.



\*\*\*



\## Quick Sort: Java Implementation



This project provides an efficient and clean implementation of the \*\*Quick Sort\*\* sorting algorithm in \*\*Java\*\*. Quick Sort is one of the fastest and most popular sorting algorithms based on the "\*\*Divide and Conquer\*\*" paradigm, widely used in computer science applications.



---



\## 💡 المفهوم الأساسي (Core Concept)



\### العربية



تعتمد الخوارزمية على تقسيم المصفوفة بشكل متكرر حول عنصر يُسمى \*\*نقطة الارتكاز (Pivot)\*\*.



1\.  \*\*اختيار نقطة الارتكاز:\*\* يتم اختيار عنصر ليكون هو Pivot (في هذا الكود، تم اختيار آخر عنصر).

2\.  \*\*التقسيم (Partitioning):\*\* يتم إعادة ترتيب عناصر المصفوفة بحيث تكون العناصر الأصغر من Pivot على يساره، والأكبر على يمينه.

3\.  \*\*التكرار (Recursion):\*\* تُطبَّق العملية بشكل متكرر على الأجزاء الفرعية (Sub-arrays) التي تقع على جانبي الـPivot حتى يتم فرز المصفوفة بالكامل.



\### English



The algorithm recursively partitions the array around a chosen element called the \*\*Pivot\*\*.



1\.  \*\*Pivot Selection:\*\* An element is chosen as the pivot (in this code, the last element is used).

2\.  \*\*Partitioning:\*\* The array is rearranged so that all elements smaller than the pivot are placed to its left, and all elements greater are placed to its right.

3\.  \*\*Recursion:\*\* The process is recursively applied to the sub-arrays to the left and right of the pivot until the entire array is sorted.



---



\## ⏱️ كفاءة الأداء (Time Complexity)



| السيناريو (Scenario) | التعقيد الزمني (Time Complexity) | ملاحظات (Notes) |

| :--- | :--- | :--- |

| \*\*الحالة المتوسطة (Average Case)\*\* | $O(n \\log n)$ | يُعتبر أداء ممتازاً ومثالياً لمعظم التطبيقات. |

| \*\*الحالة الأسوأ (Worst Case)\*\* | $O(n^2)$ | يحدث عندما يتم اختيار الـPivot بشكل سيئ دائماً. |



---



\## 💻 طريقة التشغيل (How to Run)



\### المتطلبات (Prerequisites)



تحتاج إلى تثبيت \*\*Java Development Kit (JDK)\*\* على جهازك.



\### تشغيل الكود (Execution Steps)



1\.  استنسخ المستودع (Clone the repository):

&nbsp;   ```bash

&nbsp;   git clone \[https://github.com/TahaOlayyan/QuickSort-Java-Implementation.git](https://github.com/TahaOlayyan/QuickSort-Java-Implementation.git)

&nbsp;   cd QuickSort-Java-Implementation

&nbsp;   ```

2\.  قم بتجميع ملف Java (Compile the Java file):

&nbsp;   ```bash

&nbsp;   javac Quick\_Sort\_Algorithms.java

&nbsp;   ```

3\.  شغّل الكلاس المجمّع (Execute the compiled class file):

&nbsp;   ```bash

&nbsp;   java Quick\_Sort\_Algorithms

&nbsp;   ```

&nbsp;   سيتم عرض المصفوفة قبل وبعد عملية الفرز.



---



\## 🤝 المساهمة (Contribution)



\*\*العربية:\*\* المساهمات مرحب بها جداً! إذا كان لديك أي اقتراحات أو تحسينات على الكود، نرجو منك فتح \*\*طلب سحب (Pull Request)\*\*.



\*\*English:\*\* Contributions are highly welcomed! If you have any suggestions or improvements to the code, please feel free to open a \*\*Pull Request\*\*.



---



\*\*المؤلف (Author):\*\* Taha Olayyan

