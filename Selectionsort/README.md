<h1>Selection Sort</h1>
<p>Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list. </p>

<p>The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first element of the unsorted part. This process is repeated for the remaining unsorted portion until the entire list is sorted. </p>

<h2>How Selection Sort Works?</h2>
<p>Consider the following depicted array as an example.</p>
<h1>14 33 27 10 35 19 42 44</h1>

<p>For the first position in the sorted list, the whole list is scanned sequentially. The first position where 14 is stored presently, we search the whole list and find that 10 is the lowest value.</p>
<h1>14 33 27 10 35 19 42 44</h1>

<p>So we replace 14 with 10. After one iteration 10, which happens to be the minimum value in the list, appears in the first position of the sorted list.</p>
<h1>10 33 27 14 35 19 42 44</h1>

<p>For the second position, where 33 is residing, we start scanning the rest of the list in a linear manner.</p>
<h1>10 33 27 14 35 19 42 44</h1>

<p>We find that 14 is the second lowest value in the list and it should appear at the second place. We swap these values.</p>
<h1>10 33 27 14 35 19 42 44</h1>
<p>After two iterations, two least values are positioned at the beginning in a sorted manner</p>
<h1>10 14 27 33 35 19 42 44</h1>
<p>The same process is applied to the rest of the items in the array.</p>



