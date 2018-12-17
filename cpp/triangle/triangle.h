#if !defined(TRIANGLE_H)
#define TRIANGLE_H

#include <stdexcept>

namespace triangle
{
  enum triangleKind
  {
    equilateral,
    isosceles,
    scalene,
  };

  template<typename Length>
  triangle::triangleKind kind(Length side1, Length side2, Length side3)
  {
    if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2)
      throw std::domain_error("Sum of two shorter sides is lower than length of the longest side");
    if (side1 <= 0 || side2 <= 0 || side3 <= 0)
      throw std::domain_error("A side is lower or equal 0");

    if (side1 == side2 && side2 == side3)
      return triangle::equilateral;
    if (side1 != side2 && side1 != side3 && side2 != side3)
      return triangle::scalene;
    else
      return triangle::isosceles;
  }
}

#endif
