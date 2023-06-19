<h2> Insertion Sort</h2>
<p>Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.</p>

<h2>Insertion Sort Algorithm</h2>
<p>To sort an array of size N in ascending order iterate over the array and compare the current element (key) to its predecessor, if the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.</p>

<ol>
  <h3>The simple steps of achieving the insertion sort are listed as follows -</h3>h3>
  <li> If the element is the first element, assume that it is already sorted. Return 1.</li>
  <li>Pick the next element, and store it separately in a key.</li>
  <li>Now, compare the key with all elements in the sorted array.</li>
  <li>If the element in the sorted array is smaller than the current element, then move to the next element. Else, shift greater elements in the array towards the right.</li>
  <li>Insert the value.</li>
  <li> Repeat until the array is sorted.</li>
</ol>
