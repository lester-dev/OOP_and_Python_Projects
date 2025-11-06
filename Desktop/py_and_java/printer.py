class InkPrinter:
    def print_document(self, document):
        print(f"Printing '{document}' using ink printer...")

class LaserPrinter:
    def print_document(self, document):
        print(f"Printing '{document}' using laser printer...")

# Example usage
ink_printer = InkPrinter()
laser_printer = LaserPrinter()

ink_printer.print_document("Report")  # InkPrinter's method
laser_printer.print_document("Invoice")  # LaserPrinter's method
